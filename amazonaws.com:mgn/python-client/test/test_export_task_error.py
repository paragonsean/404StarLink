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

from openapi_client.models.export_task_error import ExportTaskError

class TestExportTaskError(unittest.TestCase):
    """ExportTaskError unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ExportTaskError:
        """Test ExportTaskError
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ExportTaskError`
        """
        model = ExportTaskError()
        if include_optional:
            return ExportTaskError(
                error_data = None,
                error_date_time = None
            )
        else:
            return ExportTaskError(
        )
        """

    def testExportTaskError(self):
        """Test ExportTaskError"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
