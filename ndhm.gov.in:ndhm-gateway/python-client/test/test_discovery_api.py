# coding: utf-8

"""
    Gateway

    Gateway is the hub that routes/orchestrates the interaction between consent managers and API bridges. There are 5 categories of APIs; discovery, link, consent flow, data flow and  monitoring. To reflect the consumers of APIs, the above apis are also categorized under cm facing, hiu facing and hip facing  

    The version of the OpenAPI document: 0.5
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.discovery_api import DiscoveryApi


class TestDiscoveryApi(unittest.TestCase):
    """DiscoveryApi unit test stubs"""

    def setUp(self) -> None:
        self.api = DiscoveryApi()

    def tearDown(self) -> None:
        pass

    def test_v05_care_contexts_discover_post(self) -> None:
        """Test case for v05_care_contexts_discover_post

        Discover patient's accounts
        """
        pass

    def test_v05_care_contexts_on_discover_post(self) -> None:
        """Test case for v05_care_contexts_on_discover_post

        Response to patient's account discovery request
        """
        pass


if __name__ == '__main__':
    unittest.main()
