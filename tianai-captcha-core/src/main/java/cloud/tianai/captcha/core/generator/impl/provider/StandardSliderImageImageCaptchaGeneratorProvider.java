package cloud.tianai.captcha.core.generator.impl.provider;

import cloud.tianai.captcha.core.common.constant.CaptchaTypeConstant;
import cloud.tianai.captcha.core.generator.ImageCaptchaGenerator;
import cloud.tianai.captcha.core.generator.ImageCaptchaGeneratorProvider;
import cloud.tianai.captcha.core.generator.ImageTransform;
import cloud.tianai.captcha.core.generator.impl.StandardSliderImageCaptchaGenerator;
import cloud.tianai.captcha.core.resource.ImageCaptchaResourceManager;

/**
 * @Author: 天爱有情
 * @date 2022/5/19 15:09
 * @Description 滑动验证码 生成器
 */
public class StandardSliderImageImageCaptchaGeneratorProvider implements ImageCaptchaGeneratorProvider {
    @Override
    public ImageCaptchaGenerator get(ImageCaptchaResourceManager resourceManager, ImageTransform imageTransform) {
        return new StandardSliderImageCaptchaGenerator(resourceManager, imageTransform);
    }

    @Override
    public String getType() {
        return CaptchaTypeConstant.SLIDER;
    }
}
