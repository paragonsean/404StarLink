# coding: utf-8

"""
    Gateway

    Gateway is the hub that routes/orchestrates the interaction between consent managers and API bridges. There are 5 categories of APIs; discovery, link, consent flow, data flow and  monitoring. To reflect the consumers of APIs, the above apis are also categorized under cm facing, hiu facing and hip facing  

    The version of the OpenAPI document: 0.5
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.sessions_api import SessionsApi


class TestSessionsApi(unittest.TestCase):
    """SessionsApi unit test stubs"""

    def setUp(self) -> None:
        self.api = SessionsApi()

    def tearDown(self) -> None:
        pass

    def test_v05_certs_get(self) -> None:
        """Test case for v05_certs_get

        Get certs for JWT verification
        """
        pass

    def test_v05_sessions_post(self) -> None:
        """Test case for v05_sessions_post

        Get access token
        """
        pass

    def test_v05_well_known_openid_configuration_get(self) -> None:
        """Test case for v05_well_known_openid_configuration_get

        Get openid configuration
        """
        pass


if __name__ == '__main__':
    unittest.main()
