
        // Binary search
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (end - start) / 2;

            if (arr[mid] == search) {
                System.out.println("Element " + search + " is found at index : " + mid);
                break;
            } else if (arr[mid] < search) {
                start = mid + 1;
            } else if (arr[mid] > search) {
                end = mid - 1;
            }
        }