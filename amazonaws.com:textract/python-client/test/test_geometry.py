# coding: utf-8

"""
    Amazon Textract

    Amazon Textract detects and analyzes text in documents and converts it into machine-readable text. This is the API reference documentation for Amazon Textract.

    The version of the OpenAPI document: 2018-06-27
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.geometry import Geometry

class TestGeometry(unittest.TestCase):
    """Geometry unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Geometry:
        """Test Geometry
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Geometry`
        """
        model = Geometry()
        if include_optional:
            return Geometry(
                bounding_box = None,
                polygon = None
            )
        else:
            return Geometry(
        )
        """

    def testGeometry(self):
        """Test Geometry"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
