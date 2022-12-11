# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.commission_api import CommissionApi


class TestCommissionApi(unittest.TestCase):
    """CommissionApi unit test stubs"""

    def setUp(self) -> None:
        self.api = CommissionApi()

    def tearDown(self) -> None:
        pass

    def test_get_commissions(self) -> None:
        """Test case for get_commissions

        Returns a commission list of current client.
        """
        pass

    def test_get_commissions_by_filter(self) -> None:
        """Test case for get_commissions_by_filter

        Returns a commission list of current client.
        """
        pass


if __name__ == '__main__':
    unittest.main()
