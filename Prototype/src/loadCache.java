public static void loadCache() {

	  Square square = new Square();
      square.setId("1");
      shapeMap.put(square.getId(),square);

      Rectangle rectangle = new Rectangle();
      rectangle.setId("2");
      shapeMap.put(rectangle.getId(), rectangle);
   }
}
