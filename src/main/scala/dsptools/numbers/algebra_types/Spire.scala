package dsptools

package object numbers {
  type AdditiveGroup[T] = spire.algebra.AdditiveGroup[T]
  type CMonoid[T] = spire.algebra.CMonoid[T]
  type Field[T] = spire.algebra.Field[T]
  type MultiplicativeAction[T, U] = spire.algebra.MultiplicativeAction[T, U]
  type MultiplicativeCMonoid[T] = spire.algebra.MultiplicativeCMonoid[T]
  type ConvertableFrom[T] = spire.math.ConvertableFrom[T]

  val Multiplicative = spire.algebra.Multiplicative
}
