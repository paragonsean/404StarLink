# coding: utf-8

"""
    Cloud Spanner API

    Cloud Spanner is a managed, mission-critical, globally consistent and scalable relational database service.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.list_database_operations_response import ListDatabaseOperationsResponse

class TestListDatabaseOperationsResponse(unittest.TestCase):
    """ListDatabaseOperationsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListDatabaseOperationsResponse:
        """Test ListDatabaseOperationsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListDatabaseOperationsResponse`
        """
        model = ListDatabaseOperationsResponse()
        if include_optional:
            return ListDatabaseOperationsResponse(
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
            return ListDatabaseOperationsResponse(
        )
        """

    def testListDatabaseOperationsResponse(self):
        """Test ListDatabaseOperationsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
