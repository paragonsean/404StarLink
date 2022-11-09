# coding: utf-8

"""
    Contact Center AI Platform API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: v1alpha1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.list_operations_response import ListOperationsResponse

class TestListOperationsResponse(unittest.TestCase):
    """ListOperationsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListOperationsResponse:
        """Test ListOperationsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListOperationsResponse`
        """
        model = ListOperationsResponse()
        if include_optional:
            return ListOperationsResponse(
                next_page_token = '',
                operations = [
                    openapi_client.models.operation.Operation(
                        done = True, 
                        error = openapi_client.models.status.Status(
                            code = 56, 
                            details = [
                                {
                                    'key' : null
                                    }
                                ], 
                            message = '', ), 
                        metadata = {
                            'key' : null
                            }, 
                        name = '', 
                        response = {
                            'key' : null
                            }, )
                    ]
            )
        else:
            return ListOperationsResponse(
        )
        """

    def testListOperationsResponse(self):
        """Test ListOperationsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
