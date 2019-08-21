import java.util.*;

public class PaginationHelper<T> {
  private int itemCount;
  private int itemsPerPage;
  private int pageCount;
  
  public PaginationHelper(List<T> items, int itemsPerPage) {
    this(items.size(), itemsPerPage);
  }
  
  public PaginationHelper(int itemCount, int itemsPerPage) {
    this.itemCount = itemCount;
    this.itemsPerPage = itemsPerPage;
    pageCount = (int) Math.ceil(itemCount / (double) itemsPerPage);
  }

  public int itemCount() {
    return itemCount;
  }

  public int pageCount() {
    return pageCount;
  }

  public int pageItemCount(int pageIndex) {
    int lastPageIndex = pageCount - 1;
    
    if (pageIndex < 0 || pageIndex > lastPageIndex) return -1;

    if (pageIndex < lastPageIndex) return itemsPerPage;
    
    return itemCount - itemsPerPage * lastPageIndex;
  }

  public int pageIndex(int itemIndex) {
    if (itemIndex < 0 || itemIndex >= itemCount) {
      return -1;
    }
    return itemIndex / itemsPerPage;
  }
}

//:vault-boy-thumps-up:
