class IdFactoryTest extends org.scalatest.funsuite.AnyFunSuite{
  test("IdFactory.create") {
    assert(IdFactory.create() === 1)
    assert(IdFactory.create() === 2)

  }
}