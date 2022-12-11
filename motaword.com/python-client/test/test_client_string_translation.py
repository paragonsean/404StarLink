# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.client_string_translation import ClientStringTranslation

class TestClientStringTranslation(unittest.TestCase):
    """ClientStringTranslation unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ClientStringTranslation:
        """Test ClientStringTranslation
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ClientStringTranslation`
        """
        model = ClientStringTranslation()
        if include_optional:
            return ClientStringTranslation(
                content = '',
                last_changed = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                resource = '',
                resource_id = '',
                state = 'Translated',
                target_language = ''
            )
        else:
            return ClientStringTranslation(
        )
        """

    def testClientStringTranslation(self):
        """Test ClientStringTranslation"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
