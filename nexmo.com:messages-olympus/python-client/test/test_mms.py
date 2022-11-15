# coding: utf-8

"""
    Messages API

    The Messages API consolidates and normalises exchanges across all messaging channels. It allows you to use a single API to interact with our various channels such as SMS, MMS, WhatsApp, Viber and Facebook Messenger

    The version of the OpenAPI document: 1.4.0
    Contact: devrel@nexmo.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mms import MMS

class TestMMS(unittest.TestCase):
    """MMS unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MMS:
        """Test MMS
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MMS`
        """
        model = MMS()
        if include_optional:
            return MMS(
                client_ref = '',
                image = openapi_client.models.mms_one_of_all_of_image.MMS_oneOf_allOf_image(
                    caption = 'Additional text to accompany the image.', 
                    url = 'https://example.com/image.jpg', ),
                message_type = 'video',
                channel = 'mms',
                var_from = '447700900001',
                to = '447700900000',
                vcard = openapi_client.models.mms_one_of_1_all_of_vcard.MMS_oneOf_1_allOf_vcard(
                    url = 'https://example.com/contact.vcf', ),
                audio = openapi_client.models.mms_one_of_2_all_of_audio.MMS_oneOf_2_allOf_audio(
                    caption = 'Additional text to accompany the audio file.', 
                    url = 'https://example.com/audio.mp3', ),
                video = openapi_client.models.mms_one_of_3_all_of_video.MMS_oneOf_3_allOf_video(
                    caption = 'Additional text to accompany the video file.', 
                    url = 'https://example.com/video.mp4', )
            )
        else:
            return MMS(
                image = openapi_client.models.mms_one_of_all_of_image.MMS_oneOf_allOf_image(
                    caption = 'Additional text to accompany the image.', 
                    url = 'https://example.com/image.jpg', ),
                message_type = 'video',
                channel = 'mms',
                var_from = '447700900001',
                to = '447700900000',
                vcard = openapi_client.models.mms_one_of_1_all_of_vcard.MMS_oneOf_1_allOf_vcard(
                    url = 'https://example.com/contact.vcf', ),
                audio = openapi_client.models.mms_one_of_2_all_of_audio.MMS_oneOf_2_allOf_audio(
                    caption = 'Additional text to accompany the audio file.', 
                    url = 'https://example.com/audio.mp3', ),
                video = openapi_client.models.mms_one_of_3_all_of_video.MMS_oneOf_3_allOf_video(
                    caption = 'Additional text to accompany the video file.', 
                    url = 'https://example.com/video.mp4', ),
        )
        """

    def testMMS(self):
        """Test MMS"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
