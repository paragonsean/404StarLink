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

from openapi_client.models.sms_message import SMSMessage

class TestSMSMessage(unittest.TestCase):
    """SMSMessage unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SMSMessage:
        """Test SMSMessage
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SMSMessage`
        """
        model = SMSMessage()
        if include_optional:
            return SMSMessage(
                body = None,
                keyword = None,
                media_url = None,
                message_type = None,
                origination_number = None,
                sender_id = None,
                substitutions = None,
                entity_id = None,
                template_id = None
            )
        else:
            return SMSMessage(
        )
        """

    def testSMSMessage(self):
        """Test SMSMessage"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
