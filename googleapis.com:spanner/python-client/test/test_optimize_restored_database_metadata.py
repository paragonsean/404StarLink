# coding: utf-8

"""
    Cloud Spanner API

    Cloud Spanner is a managed, mission-critical, globally consistent and scalable relational database service.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.optimize_restored_database_metadata import OptimizeRestoredDatabaseMetadata

class TestOptimizeRestoredDatabaseMetadata(unittest.TestCase):
    """OptimizeRestoredDatabaseMetadata unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OptimizeRestoredDatabaseMetadata:
        """Test OptimizeRestoredDatabaseMetadata
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OptimizeRestoredDatabaseMetadata`
        """
        model = OptimizeRestoredDatabaseMetadata()
        if include_optional:
            return OptimizeRestoredDatabaseMetadata(
                name = '',
                progress = openapi_client.models.operation_progress.OperationProgress(
                    end_time = '', 
                    progress_percent = 56, 
                    start_time = '', )
            )
        else:
            return OptimizeRestoredDatabaseMetadata(
        )
        """

    def testOptimizeRestoredDatabaseMetadata(self):
        """Test OptimizeRestoredDatabaseMetadata"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
