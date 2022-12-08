# coding: utf-8

"""
    DoubleClick Bid Manager API

    DoubleClick Bid Manager API allows users to manage and create campaigns and reports.

    The version of the OpenAPI document: v2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.model_date import ModelDate

class TestModelDate(unittest.TestCase):
    """ModelDate unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModelDate:
        """Test ModelDate
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModelDate`
        """
        model = ModelDate()
        if include_optional:
            return ModelDate(
                day = 56,
                month = 56,
                year = 56
            )
        else:
            return ModelDate(
        )
        """

    def testModelDate(self):
        """Test ModelDate"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
