# coding: utf-8

"""
    ocrapi

    The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.receipt_line_item import ReceiptLineItem

class TestReceiptLineItem(unittest.TestCase):
    """ReceiptLineItem unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ReceiptLineItem:
        """Test ReceiptLineItem
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ReceiptLineItem`
        """
        model = ReceiptLineItem()
        if include_optional:
            return ReceiptLineItem(
                item_description = '',
                item_price = 1.337
            )
        else:
            return ReceiptLineItem(
        )
        """

    def testReceiptLineItem(self):
        """Test ReceiptLineItem"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
