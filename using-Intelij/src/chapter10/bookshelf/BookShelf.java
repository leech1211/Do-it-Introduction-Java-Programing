package chapter10.bookshelf;

public class BookShelf extends Shelf implements Queue{
    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0); //맨 처음요소를 삭제 후 반환
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
