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

from openapi_client.models.direct_message_configuration import DirectMessageConfiguration

class TestDirectMessageConfiguration(unittest.TestCase):
    """DirectMessageConfiguration unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DirectMessageConfiguration:
        """Test DirectMessageConfiguration
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DirectMessageConfiguration`
        """
        model = DirectMessageConfiguration()
        if include_optional:
            return DirectMessageConfiguration(
                adm_message = None,
                apns_message = None,
                baidu_message = None,
                default_message = None,
                default_push_notification_message = None,
                email_message = None,
                gcm_message = None,
                sms_message = None,
                voice_message = None
            )
        else:
            return DirectMessageConfiguration(
        )
        """

    def testDirectMessageConfiguration(self):
        """Test DirectMessageConfiguration"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
