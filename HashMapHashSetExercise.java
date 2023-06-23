import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapHashSetExercise {

    // 2. Phân loại các số nguyên tố và các số không phải số nguyên tố
    public static boolean checkPrime(Integer n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % 2 == 0)
                return false;
        return true;
    }

    public static HashMap<String, List<Integer>> classifyPrime(List<Integer> nums) {
        HashMap<String, List<Integer>> result = new HashMap<>();
        result.put("prime", new ArrayList<>());
        result.put("not_prime", new ArrayList<>());
        for (Integer number : nums)
            if (checkPrime(number))
                result.get("prime").add(number);
            else
                result.get("not_prime").add(number);
        return result;
    }

    // 5. Tạo class Inventory, cung cấp các method put, get, remove, mô tả bài toán
    // được thể hiện ở bên dưới:
    public static class Product {
        String name;
        double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    public static class Inventory {
        HashMap<String, List<Product>> products = new HashMap<>();

        public void put(Product product) {
            if (products.containsKey(product.name))
                products.get(product.name).add(product);
            else
                products.put(product.name, new ArrayList<>(List.of(product)));
        }

        /// Lấy danh sách sản phẩm theo `name`
        List<Product> get(String name) {
            return products.get(name);
        }

        /// Xóa toàn bộ sản phẩm có trùng `name`
        boolean remove(String name) {
            List<Product> listProductRemoved = products.remove(name);
            return (listProductRemoved == null) ? false : true;
        }

        /// Trả về tổng giá trị hàng hóa của 1 sản phẩm
        double totalPriceOf(String name) {
            int total = 0;
            if (products.get(name) == null)
                return total;
            for (Product p : products.get(name))
                total += p.price;
            return total;
        }

        /// Đếm tổng số lượng hàng hóa của 1 sản phẩm
        int countTotal(String name) {
            return products.get(name).size();
        }
    }

    public static void main(String[] args) {
        HashMap<String, List<Integer>> classifyPrimeMap = new HashMap<>(
                classifyPrime(List.of(1, 2, 3, 4, 5, 6, 7, 11, 13, 29, 30)));
        System.out.println(classifyPrimeMap);

        Product myProduct1 = new Product("book", 12d);
        Product myProduct2 = new Product("pen", 6d);
        Product myProduct3 = new Product("notebook", 10d);
        Product myProduct4 = new Product("book", 15d);

        Inventory myInventory = new Inventory();
        myInventory.put(myProduct1);
        myInventory.put(myProduct2);
        myInventory.put(myProduct3);
        myInventory.put(myProduct4);

        System.out.println("Get List product by name: ");
        List<Product> listProductByName = myInventory.get("book");
        if(listProductByName != null)
            for(Product p : listProductByName)
                System.out.println(p.name + " " + p.price);
        
        String productName = "pen";
        System.out.println("remove " + productName + " from list? " + myInventory.remove(productName));

        String productName2 = "book";
        System.out.println("total price of " + productName2 + ": " + myInventory.totalPriceOf(productName2));
    }
}
