object SortWord {
  def sort(str: String): String = {
    str.toSet.toList
      .map((r: Char) => r -> str.count(q => q == r))
      .sortBy(r => r._1)
      .sortBy(_._2)
      .reverse
      .map(tuple => {
        val (character, integer) = tuple
        character.toString * integer
      }).mkString
  }
}
