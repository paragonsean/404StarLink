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

from openapi_client.models.delete_endpoint_response import DeleteEndpointResponse

class TestDeleteEndpointResponse(unittest.TestCase):
    """DeleteEndpointResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DeleteEndpointResponse:
        """Test DeleteEndpointResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DeleteEndpointResponse`
        """
        model = DeleteEndpointResponse()
        if include_optional:
            return DeleteEndpointResponse(
                endpoint_response = openapi_client.models.endpoint_response.EndpointResponse(
                    address = null, 
                    application_id = null, 
                    attributes = null, 
                    channel_type = null, 
                    cohort_id = null, 
                    creation_date = null, 
                    demographic = null, 
                    effective_date = null, 
                    endpoint_status = null, 
                    id = null, 
                    location = null, 
                    metrics = null, 
                    opt_out = null, 
                    request_id = null, 
                    user = null, )
            )
        else:
            return DeleteEndpointResponse(
                endpoint_response = openapi_client.models.endpoint_response.EndpointResponse(
                    address = null, 
                    application_id = null, 
                    attributes = null, 
                    channel_type = null, 
                    cohort_id = null, 
                    creation_date = null, 
                    demographic = null, 
                    effective_date = null, 
                    endpoint_status = null, 
                    id = null, 
                    location = null, 
                    metrics = null, 
                    opt_out = null, 
                    request_id = null, 
                    user = null, ),
        )
        """

    def testDeleteEndpointResponse(self):
        """Test DeleteEndpointResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
