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

from openapi_client.models.sms_one_of import SMSOneOf

class TestSMSOneOf(unittest.TestCase):
    """SMSOneOf unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SMSOneOf:
        """Test SMSOneOf
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SMSOneOf`
        """
        model = SMSOneOf()
        if include_optional:
            return SMSOneOf(
                client_ref = '',
                message_type = 'text',
                text = None,
                channel = 'sms',
                var_from = '447700900001',
                to = '447700900000'
            )
        else:
            return SMSOneOf(
                message_type = 'text',
                text = None,
                channel = 'sms',
                var_from = '447700900001',
                to = '447700900000',
        )
        """

    def testSMSOneOf(self):
        """Test SMSOneOf"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
