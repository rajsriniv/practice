class TwoSortedArrayMedian {

  private static double findMedian(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        double median = 0;
        int[] result = new int[m + n];
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
        Arrays.sort(result);
        if ((result.length) % 2 == 0) {
            median = (double) (result[(result.length / 2) - 1] + result[result.length / 2]) / 2;
        } else {
            median = (double) (result[result.length / 2]);
        }
        return median;
  }
  public static void main(string[] args) {
    int[] nums1 = new int[]{1, 2, 4};
    int[] nums2 = new int[]{3, 5, 6};
    System.out.println(findMedian(nums1, nums2));
  }
}
