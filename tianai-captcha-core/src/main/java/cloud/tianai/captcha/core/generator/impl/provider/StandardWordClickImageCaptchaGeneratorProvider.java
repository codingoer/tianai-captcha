package cloud.tianai.captcha.core.generator.impl.provider;

import cloud.tianai.captcha.core.common.constant.CaptchaTypeConstant;
import cloud.tianai.captcha.core.generator.ImageCaptchaGenerator;
import cloud.tianai.captcha.core.generator.ImageCaptchaGeneratorProvider;
import cloud.tianai.captcha.core.generator.ImageTransform;
import cloud.tianai.captcha.core.generator.impl.StandardWordClickImageCaptchaGenerator;
import cloud.tianai.captcha.core.resource.ImageCaptchaResourceManager;

public class StandardWordClickImageCaptchaGeneratorProvider implements ImageCaptchaGeneratorProvider {
    @Override
    public ImageCaptchaGenerator get(ImageCaptchaResourceManager resourceManager, ImageTransform imageTransform) {
        return new StandardWordClickImageCaptchaGenerator(resourceManager, imageTransform);
    }

    @Override
    public String getType() {
        return CaptchaTypeConstant.WORD_IMAGE_CLICK;
    }
}
