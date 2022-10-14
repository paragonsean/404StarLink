# coding: utf-8

"""
    Cloud Spanner API

    Cloud Spanner is a managed, mission-critical, globally consistent and scalable relational database service.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.list_backup_operations_response import ListBackupOperationsResponse

class TestListBackupOperationsResponse(unittest.TestCase):
    """ListBackupOperationsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListBackupOperationsResponse:
        """Test ListBackupOperationsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListBackupOperationsResponse`
        """
        model = ListBackupOperationsResponse()
        if include_optional:
            return ListBackupOperationsResponse(
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
            return ListBackupOperationsResponse(
        )
        """

    def testListBackupOperationsResponse(self):
        """Test ListBackupOperationsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
