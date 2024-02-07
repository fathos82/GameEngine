package org.example.game_object;


import org.example.game_object.components.Component;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class GameObject {
    public Long ID;
    public Transform transform;
    private List<Component> components;


    public <T extends Component> T addComponent(Class<T> clazz) {
        for (Component component: components) {
            if(component.getClass().equals(clazz)) {
                return clazz.cast(component);
            }
        }

        try {
            T newComponent = clazz.getConstructor(GameObject.class).newInstance(this);
            components.add(newComponent);
            return newComponent;
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public <T extends Component> T getComponent(Class<T> clazz) {
        for (Component component: components) {
            if(component.getClass().equals(clazz)) {
                return clazz.cast(component);
            }
        }
        return null;
    }

    private void updateComponents() {
        for (Component component: components) {
            component.update();
        }
    }

    public void update() {
        updateComponents();
    }
}
