package prac3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class MySet<T> implements Set<T> {

    Semaphore semaphore = new Semaphore(1);

    Set<T> set;

    public MySet() {
        set = new HashSet<>();
    }


    @Override
    public int size() {
        try {
            semaphore.acquire();
            return set.size();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return 0;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean isEmpty() {
        try {
            semaphore.acquire();
            return set.isEmpty();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return true;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean contains(Object o) {
        try {
            semaphore.acquire();
            return set.contains(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return true;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Iterator<T> iterator() {
        try {
            semaphore.acquire();
            return set.iterator();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Object[] toArray() {
        try {
            semaphore.acquire();
            return set.toArray();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return new Object[0];
        } finally {
            semaphore.release();
        }
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        try {
            semaphore.acquire();
            return set.toArray(a);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean add(T t) {
        try {
            semaphore.acquire();
            return set.add(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean remove(Object o) {
        try {
            semaphore.acquire();
            return set.remove(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        try {
            semaphore.acquire();
            return set.containsAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        try {
            semaphore.acquire();
            return set.addAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        try {
            semaphore.acquire();
            return set.retainAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        try {
            semaphore.acquire();
            return set.removeAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        } finally {
            semaphore.release();
        }
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            set.clear();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
