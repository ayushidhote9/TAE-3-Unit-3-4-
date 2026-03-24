class TextProcessingBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tuu tuuuuu");
        sb.append("ohhh nooo");
        System.out.println("After append: " + sb);
    }
}

// Difference between StringBuilder and StringBuffer:
//
// 1. StringBuffer is thread-safe (synchronized).
//    StringBuilder is not thread-safe (not synchronized).
//
// 2. StringBuffer is slower because synchronization adds overhead.
//    StringBuilder is faster and preferred for single-threaded programs.
//
// 3. StringBuffer was introduced in early Java (JDK 1.0).
//    StringBuilder was introduced later in JDK 1.5.
//
// 4. Use StringBuffer when multiple threads access the same object.
//    Use StringBuilder when only one thread is working (better performance).
//
// 5. Both classes are mutable (their content can be changed without creating new objects).