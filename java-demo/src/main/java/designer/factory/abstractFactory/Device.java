package designer.factory.abstractFactory;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description
 */
public class Device { }

// 品牌的设计：将品牌作为父类
class AppleDevice {}
class HuaweiDevice {}
class XiaomiDevice {}
class SamsungDevice {}

// 产品类型的设计：将产品类型作为接口，约束不同的产品
interface Phone {}
interface Pad {}
interface Computer {}
interface TV {}

// 设计相关的产品
class ApplePhone extends AppleDevice implements Phone {}
class ApplePad extends AppleDevice implements Pad {}
class AppleComputer extends AppleDevice implements Computer {}

class HuaweiPhone extends HuaweiDevice implements Phone {}
class HuaweiPad extends HuaweiDevice implements Pad {}
class HuaweiComputer extends HuaweiDevice implements Computer {}

class XiaomiPhone extends XiaomiDevice implements Phone {}
class XiaomiPad extends XiaomiDevice implements Pad {}
class XiaomiTV extends XiaomiDevice implements TV {}

class SamsungPhone extends SamsungDevice implements Phone {}
class SamsungPad extends SamsungDevice implements Pad {}
