package bag;

import java.util.Iterator;
import java.util.NoSuchElementException;
public class Bag<Item> implements Iterable<Item>
{
    //начало
    private Node<Item> first;
    // кол-во  элементов в bag
    private int n;
    //вспомогательные связанный список класса
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }
    //инициализирует пустой bag.
    public Bag()
    {
        first =  null ;
        n =  0;
    }

    //добавление предмета
    public void add(Item x)
    {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = x;
        first.next = oldfirst;
        n++;
    }
   // возвращает кол-во элементов
    public int size()
    {
        return n;
    }

    //Возвращает итератор, который перебирает элементы в произвольном порядке.
    public Iterator<Item> iterator()
    {
        return new ListIterator(first);
    }
    private class ListIterator implements Iterator<Item>
    {
        private Node<Item> current;

        public ListIterator(Node<Item> first)
        {
            current = first;
        }

        public boolean hasNext()
        {
            return current != null;
        }
        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public Item next()
        {
            if (!hasNext())
                throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

}
