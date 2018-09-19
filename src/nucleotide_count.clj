(ns nucleotide-count)

(defn count [nucleotide strand]
  (try (clojure.core/count (filter #(= nucleotide %) strand))
       (catch Exception e (throw (Throwable. "Wrong input.")))))

(defn nucleotide-counts [strand]
  {
   \A (count \A strand),
   \T (count \T strand),
   \C (count \C strand),
   \G (count \G strand)})
