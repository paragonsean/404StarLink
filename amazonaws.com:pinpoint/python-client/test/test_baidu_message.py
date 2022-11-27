# coding: utf-8

"""
    Amazon Pinpoint

    Doc Engage API - Amazon Pinpoint API

    The version of the OpenAPI document: 2016-12-01
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.baidu_message import BaiduMessage

class TestBaiduMessage(unittest.TestCase):
    """BaiduMessage unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BaiduMessage:
        """Test BaiduMessage
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BaiduMessage`
        """
        model = BaiduMessage()
        if include_optional:
            return BaiduMessage(
                action = None,
                body = None,
                data = None,
                icon_reference = None,
                image_icon_url = None,
                image_url = None,
                raw_content = None,
                silent_push = None,
                small_image_icon_url = None,
                sound = None,
                substitutions = None,
                time_to_live = None,
                title = None,
                url = None
            )
        else:
            return BaiduMessage(
        )
        """

    def testBaiduMessage(self):
        """Test BaiduMessage"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
