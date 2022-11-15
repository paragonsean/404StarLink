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

from openapi_client.models.mms_one_of3 import MMSOneOf3

class TestMMSOneOf3(unittest.TestCase):
    """MMSOneOf3 unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MMSOneOf3:
        """Test MMSOneOf3
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MMSOneOf3`
        """
        model = MMSOneOf3()
        if include_optional:
            return MMSOneOf3(
                client_ref = '',
                message_type = 'video',
                video = openapi_client.models.mms_one_of_3_all_of_video.MMS_oneOf_3_allOf_video(
                    caption = 'Additional text to accompany the video file.', 
                    url = 'https://example.com/video.mp4', ),
                channel = 'mms',
                var_from = '447700900001',
                to = '447700900000'
            )
        else:
            return MMSOneOf3(
                message_type = 'video',
                video = openapi_client.models.mms_one_of_3_all_of_video.MMS_oneOf_3_allOf_video(
                    caption = 'Additional text to accompany the video file.', 
                    url = 'https://example.com/video.mp4', ),
                channel = 'mms',
                var_from = '447700900001',
                to = '447700900000',
        )
        """

    def testMMSOneOf3(self):
        """Test MMSOneOf3"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
