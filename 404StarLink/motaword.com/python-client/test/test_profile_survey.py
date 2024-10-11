# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.profile_survey import ProfileSurvey

class TestProfileSurvey(unittest.TestCase):
    """ProfileSurvey unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ProfileSurvey:
        """Test ProfileSurvey
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ProfileSurvey`
        """
        model = ProfileSurvey()
        if include_optional:
            return ProfileSurvey(
                current_services = '',
                daily_proofreading_capacity = '',
                daily_translation_capacity = '',
                dtp_software = '',
                experience = '',
                is_certified_translator = '',
                is_sworn_translator = '',
                memoq = '',
                memsource = '',
                omegat = '',
                proofreader_experience = '',
                provides_creative_writing_service = '',
                provides_postedit_service = '',
                reference = '',
                sdl_trados = '',
                skype_id = '',
                smartcat = '',
                smartling = '',
                software = '',
                specialization = '',
                subtitle_edit = '',
                subtitle_workshop = '',
                translator_association = '',
                transsuite_2000 = '',
                vendor_profile_lsp = '',
                wordbee = '',
                wordfast = '',
                work_type = '',
                work_with = '',
                working_as = '',
                working_timezone = '',
                xbench = '',
                xtm = ''
            )
        else:
            return ProfileSurvey(
        )
        """

    def testProfileSurvey(self):
        """Test ProfileSurvey"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
