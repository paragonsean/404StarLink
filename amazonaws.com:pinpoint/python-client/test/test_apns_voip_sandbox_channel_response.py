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

from openapi_client.models.apns_voip_sandbox_channel_response import APNSVoipSandboxChannelResponse

class TestAPNSVoipSandboxChannelResponse(unittest.TestCase):
    """APNSVoipSandboxChannelResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> APNSVoipSandboxChannelResponse:
        """Test APNSVoipSandboxChannelResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `APNSVoipSandboxChannelResponse`
        """
        model = APNSVoipSandboxChannelResponse()
        if include_optional:
            return APNSVoipSandboxChannelResponse(
                application_id = None,
                creation_date = None,
                default_authentication_method = None,
                enabled = None,
                has_credential = None,
                has_token_key = None,
                id = None,
                is_archived = None,
                last_modified_by = None,
                last_modified_date = None,
                platform = None,
                version = None
            )
        else:
            return APNSVoipSandboxChannelResponse(
                platform = None,
        )
        """

    def testAPNSVoipSandboxChannelResponse(self):
        """Test APNSVoipSandboxChannelResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
