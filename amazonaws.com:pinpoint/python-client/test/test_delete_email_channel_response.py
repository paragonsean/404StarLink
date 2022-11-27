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

from openapi_client.models.delete_email_channel_response import DeleteEmailChannelResponse

class TestDeleteEmailChannelResponse(unittest.TestCase):
    """DeleteEmailChannelResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DeleteEmailChannelResponse:
        """Test DeleteEmailChannelResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DeleteEmailChannelResponse`
        """
        model = DeleteEmailChannelResponse()
        if include_optional:
            return DeleteEmailChannelResponse(
                email_channel_response = openapi_client.models.email_channel_response.EmailChannelResponse(
                    application_id = null, 
                    configuration_set = null, 
                    creation_date = null, 
                    enabled = null, 
                    from_address = null, 
                    has_credential = null, 
                    id = null, 
                    identity = null, 
                    is_archived = null, 
                    last_modified_by = null, 
                    last_modified_date = null, 
                    messages_per_second = null, 
                    platform = null, 
                    role_arn = null, 
                    version = null, )
            )
        else:
            return DeleteEmailChannelResponse(
                email_channel_response = openapi_client.models.email_channel_response.EmailChannelResponse(
                    application_id = null, 
                    configuration_set = null, 
                    creation_date = null, 
                    enabled = null, 
                    from_address = null, 
                    has_credential = null, 
                    id = null, 
                    identity = null, 
                    is_archived = null, 
                    last_modified_by = null, 
                    last_modified_date = null, 
                    messages_per_second = null, 
                    platform = null, 
                    role_arn = null, 
                    version = null, ),
        )
        """

    def testDeleteEmailChannelResponse(self):
        """Test DeleteEmailChannelResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
