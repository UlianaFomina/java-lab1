class Main {
    public static void main(String[] args) {
        Food[] breakfast = new Food[20];//резервируем необходимое место в памяти для хранения 20 ссылок на объекты класса Food
        int breakfastIndex=0;
        String countProduct=null;
        for(String arg: args){
            String[] parts = arg.split("/");
            if(parts[0].equals("Apple")){
                String appleSize = parts[1];
                //в breakfast поместили объект класса Apple с размером parts[1]
                breakfast[breakfastIndex] = new Apple(appleSize);
            }
            if(parts[0].equals("IceCream")){
                String iceCreamSirup = parts[1];
                breakfast[breakfastIndex] = new IceCream(iceCreamSirup);
            }
            if(parts[0].equals("Cheese")){
                breakfast[breakfastIndex] = new Сheese(parts[0]);
            }
            if(arg.startsWith("-")){
                countProduct = arg;
                countProduct = countProduct.substring(1);
            }
            breakfastIndex++;
        }
        //System.out.println(countProduct);
        int productCounter = 0;
        for(Food element: breakfast) {
            if (element == null) break;//так как размер breakfast - 20, т.е значения которые не определены - Null
            element.consume();
            if(element.getName().equals(countProduct)){
                productCounter++;
            }
        }
        System.out.println("Количество съеденых '" + countProduct + "': " + productCounter);
    }
}

