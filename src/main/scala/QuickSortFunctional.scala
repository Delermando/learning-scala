def sort(xs: Array[Int]): Array[Int]) = {
	if (xs.lenth <= 1) xs
	else {
		val pivot = xs(xs.lenth / 2)
		Array.concat(
			sort(xs filter (pivot >)),
				 xs filter (pivot ==),
			sort(xs filter (pivot <)))
	}
}