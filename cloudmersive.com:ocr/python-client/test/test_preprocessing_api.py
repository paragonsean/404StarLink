# coding: utf-8

"""
    ocrapi

    The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.preprocessing_api import PreprocessingApi


class TestPreprocessingApi(unittest.TestCase):
    """PreprocessingApi unit test stubs"""

    def setUp(self) -> None:
        self.api = PreprocessingApi()

    def tearDown(self) -> None:
        pass

    def test_preprocessing_binarize(self) -> None:
        """Test case for preprocessing_binarize

        Convert an image of text into a binarized (light and dark) view
        """
        pass

    def test_preprocessing_binarize_advanced(self) -> None:
        """Test case for preprocessing_binarize_advanced

        Convert an image of text into a binary (light and dark) view with ML
        """
        pass

    def test_preprocessing_get_page_angle(self) -> None:
        """Test case for preprocessing_get_page_angle

        Get the angle of the page / document / receipt
        """
        pass

    def test_preprocessing_unrotate(self) -> None:
        """Test case for preprocessing_unrotate

        Detect and unrotate a document image
        """
        pass

    def test_preprocessing_unrotate_advanced(self) -> None:
        """Test case for preprocessing_unrotate_advanced

        Detect and unrotate a document image (advanced)
        """
        pass

    def test_preprocessing_unskew(self) -> None:
        """Test case for preprocessing_unskew

        Detect and unskew a photo of a document
        """
        pass


if __name__ == '__main__':
    unittest.main()
