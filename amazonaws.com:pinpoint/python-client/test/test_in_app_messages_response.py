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

from openapi_client.models.in_app_messages_response import InAppMessagesResponse

class TestInAppMessagesResponse(unittest.TestCase):
    """InAppMessagesResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> InAppMessagesResponse:
        """Test InAppMessagesResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `InAppMessagesResponse`
        """
        model = InAppMessagesResponse()
        if include_optional:
            return InAppMessagesResponse(
                in_app_message_campaigns = None
            )
        else:
            return InAppMessagesResponse(
        )
        """

    def testInAppMessagesResponse(self):
        """Test InAppMessagesResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
