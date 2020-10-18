package dao.list;

import dao.GenericDAO;
import model.Identified;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public abstract class AbstractDAO <T extends Identified<PK>, PK extends Serializable>
        implements GenericDAO<T, PK> {

    private Class<T> clazz;

    protected List<T> elements;

    public AbstractDAO(Class<T> elementClass, List<T> list) {
        this.clazz = elementClass;
        this.elements = list;
    }

    @Override
    public T getByPK(PK key) {
        T ob = elements.get((Integer) key);
        return ob;
    }

    @Override
    public Collection<T> getAll() {
        return elements;
    }

    @Override
    public T save(T ob) {
        elements.add(ob);
        return ob;
    }

    @Override
    public T update(T ob) {
        elements.set((Integer) ob.getId(), ob);
        return ob;
    }

    @Override
    public T delete(T ob) {
        elements.remove(ob);
        return ob;
    }

    @Override
    public T deleteByPK(PK key) {
        T ob = getByPK(key);
        elements.remove((Integer) key);
        return ob;
    }

    @Override
    public Collection<T> addAll(Collection<T> obs) {
        elements.addAll(obs);
        return obs;
    }

}

