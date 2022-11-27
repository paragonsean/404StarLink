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

from openapi_client.models.get_apns_sandbox_channel_response import GetApnsSandboxChannelResponse

class TestGetApnsSandboxChannelResponse(unittest.TestCase):
    """GetApnsSandboxChannelResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetApnsSandboxChannelResponse:
        """Test GetApnsSandboxChannelResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetApnsSandboxChannelResponse`
        """
        model = GetApnsSandboxChannelResponse()
        if include_optional:
            return GetApnsSandboxChannelResponse(
                apns_sandbox_channel_response = openapi_client.models.apns_sandbox_channel_response.APNSSandboxChannelResponse(
                    application_id = null, 
                    creation_date = null, 
                    default_authentication_method = null, 
                    enabled = null, 
                    has_credential = null, 
                    has_token_key = null, 
                    id = null, 
                    is_archived = null, 
                    last_modified_by = null, 
                    last_modified_date = null, 
                    platform = null, 
                    version = null, )
            )
        else:
            return GetApnsSandboxChannelResponse(
                apns_sandbox_channel_response = openapi_client.models.apns_sandbox_channel_response.APNSSandboxChannelResponse(
                    application_id = null, 
                    creation_date = null, 
                    default_authentication_method = null, 
                    enabled = null, 
                    has_credential = null, 
                    has_token_key = null, 
                    id = null, 
                    is_archived = null, 
                    last_modified_by = null, 
                    last_modified_date = null, 
                    platform = null, 
                    version = null, ),
        )
        """

    def testGetApnsSandboxChannelResponse(self):
        """Test GetApnsSandboxChannelResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
