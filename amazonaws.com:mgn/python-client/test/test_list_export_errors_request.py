# coding: utf-8

"""
    Application Migration Service

    The Application Migration Service service.

    The version of the OpenAPI document: 2020-02-26
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.list_export_errors_request import ListExportErrorsRequest

class TestListExportErrorsRequest(unittest.TestCase):
    """ListExportErrorsRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListExportErrorsRequest:
        """Test ListExportErrorsRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListExportErrorsRequest`
        """
        model = ListExportErrorsRequest()
        if include_optional:
            return ListExportErrorsRequest(
                export_id = 'export-gCu2LC4aWwWL9Y86401234567891011121314151617181920212223',
                max_results = 1,
                next_token = ''
            )
        else:
            return ListExportErrorsRequest(
                export_id = 'export-gCu2LC4aWwWL9Y86401234567891011121314151617181920212223',
        )
        """

    def testListExportErrorsRequest(self):
        """Test ListExportErrorsRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
