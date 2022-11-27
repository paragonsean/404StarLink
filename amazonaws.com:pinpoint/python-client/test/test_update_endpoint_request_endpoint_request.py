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

from openapi_client.models.update_endpoint_request_endpoint_request import UpdateEndpointRequestEndpointRequest

class TestUpdateEndpointRequestEndpointRequest(unittest.TestCase):
    """UpdateEndpointRequestEndpointRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdateEndpointRequestEndpointRequest:
        """Test UpdateEndpointRequestEndpointRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdateEndpointRequestEndpointRequest`
        """
        model = UpdateEndpointRequestEndpointRequest()
        if include_optional:
            return UpdateEndpointRequestEndpointRequest(
                address = None,
                attributes = None,
                channel_type = None,
                demographic = None,
                effective_date = None,
                endpoint_status = None,
                location = None,
                metrics = None,
                opt_out = None,
                request_id = None,
                user = None
            )
        else:
            return UpdateEndpointRequestEndpointRequest(
        )
        """

    def testUpdateEndpointRequestEndpointRequest(self):
        """Test UpdateEndpointRequestEndpointRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
