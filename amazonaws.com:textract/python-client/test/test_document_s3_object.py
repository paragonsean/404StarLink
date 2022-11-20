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

from openapi_client.models.document_s3_object import DocumentS3Object

class TestDocumentS3Object(unittest.TestCase):
    """DocumentS3Object unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DocumentS3Object:
        """Test DocumentS3Object
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DocumentS3Object`
        """
        model = DocumentS3Object()
        if include_optional:
            return DocumentS3Object(
                bucket = None,
                name = None,
                version = None
            )
        else:
            return DocumentS3Object(
        )
        """

    def testDocumentS3Object(self):
        """Test DocumentS3Object"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
