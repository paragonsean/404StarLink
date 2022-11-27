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

from openapi_client.models.update_apns_sandbox_channel_request_apns_sandbox_channel_request import UpdateApnsSandboxChannelRequestAPNSSandboxChannelRequest

class TestUpdateApnsSandboxChannelRequestAPNSSandboxChannelRequest(unittest.TestCase):
    """UpdateApnsSandboxChannelRequestAPNSSandboxChannelRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdateApnsSandboxChannelRequestAPNSSandboxChannelRequest:
        """Test UpdateApnsSandboxChannelRequestAPNSSandboxChannelRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdateApnsSandboxChannelRequestAPNSSandboxChannelRequest`
        """
        model = UpdateApnsSandboxChannelRequestAPNSSandboxChannelRequest()
        if include_optional:
            return UpdateApnsSandboxChannelRequestAPNSSandboxChannelRequest(
                bundle_id = None,
                certificate = None,
                default_authentication_method = None,
                enabled = None,
                private_key = None,
                team_id = None,
                token_key = None,
                token_key_id = None
            )
        else:
            return UpdateApnsSandboxChannelRequestAPNSSandboxChannelRequest(
        )
        """

    def testUpdateApnsSandboxChannelRequestAPNSSandboxChannelRequest(self):
        """Test UpdateApnsSandboxChannelRequestAPNSSandboxChannelRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
