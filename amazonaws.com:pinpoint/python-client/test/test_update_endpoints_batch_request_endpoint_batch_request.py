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

from openapi_client.models.update_endpoints_batch_request_endpoint_batch_request import UpdateEndpointsBatchRequestEndpointBatchRequest

class TestUpdateEndpointsBatchRequestEndpointBatchRequest(unittest.TestCase):
    """UpdateEndpointsBatchRequestEndpointBatchRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdateEndpointsBatchRequestEndpointBatchRequest:
        """Test UpdateEndpointsBatchRequestEndpointBatchRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdateEndpointsBatchRequestEndpointBatchRequest`
        """
        model = UpdateEndpointsBatchRequestEndpointBatchRequest()
        if include_optional:
            return UpdateEndpointsBatchRequestEndpointBatchRequest(
                item = None
            )
        else:
            return UpdateEndpointsBatchRequestEndpointBatchRequest(
        )
        """

    def testUpdateEndpointsBatchRequestEndpointBatchRequest(self):
        """Test UpdateEndpointsBatchRequestEndpointBatchRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
