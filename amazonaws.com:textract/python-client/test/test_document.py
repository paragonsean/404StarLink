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

from openapi_client.models.document import Document

class TestDocument(unittest.TestCase):
    """Document unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Document:
        """Test Document
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Document`
        """
        model = Document()
        if include_optional:
            return Document(
                bytes = None,
                s3_object = None
            )
        else:
            return Document(
        )
        """

    def testDocument(self):
        """Test Document"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
