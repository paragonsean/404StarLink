# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.users_report import UsersReport

class TestUsersReport(unittest.TestCase):
    """UsersReport unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UsersReport:
        """Test UsersReport
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UsersReport`
        """
        model = UsersReport()
        if include_optional:
            return UsersReport(
                meta = openapi_client.models.paging_meta.PagingMeta(
                    paging = openapi_client.models.paging_meta_paging.PagingMeta_paging(
                        count = 56, 
                        links = null, 
                        page = 56, 
                        per_page = 56, 
                        total_count = 56, ), ),
                report = [
                    openapi_client.models.users_report_report_inner.UsersReport_report_inner(
                        currency = '', 
                        spending = 1.337, 
                        user = openapi_client.models.user.User(
                            billing = null, 
                            birthday = datetime.datetime.strptime('1975-12-30', '%Y-%m-%d').date(), 
                            can_work_manual_files = True, 
                            city = '', 
                            client = openapi_client.models.user_client.User_client(
                                corporate = openapi_client.models.user_client_corporate.User_client_corporate(
                                    email = '', 
                                    id = 56, 
                                    logo = '', 
                                    name = '', 
                                    phone_number = '', ), 
                                nps = 1.337, 
                                subjects = {
                                    'key' : 56
                                    }, ), 
                            corporate_id = 56, 
                            country = '', 
                            created_at = 56, 
                            do_not_contact = True, 
                            email = '', 
                            first_name = '', 
                            has_pwd = True, 
                            id = 56, 
                            is_client = True, 
                            is_developer = True, 
                            is_proofreader = True, 
                            is_prospect = True, 
                            is_sales_person = True, 
                            is_vendor = True, 
                            language_pairs = [
                                openapi_client.models.language_pair.LanguagePair(
                                    source_language = '', 
                                    target_language = '', )
                                ], 
                            last_name = '', 
                            last_seen_online_at = 56, 
                            links = null, 
                            locale = '', 
                            mailing = openapi_client.models.address.Address(
                                city = '', 
                                country = '', 
                                phone = '', 
                                state = '', 
                                street = '', 
                                zip = '', ), 
                            name = '', 
                            native_language = '', 
                            nps = 1.337, 
                            phone_number = '', 
                            profile_picture_path = '', 
                            social_media = openapi_client.models.social_media.SocialMedia(
                                facebook_url = '', 
                                linked_in_url = '', 
                                twitter_url = '', ), 
                            state = '', 
                            status = '', 
                            street = '', 
                            timezone = '', 
                            tms_user_name = '', 
                            user_groups = [
                                openapi_client.models.user_group.UserGroup(
                                    corporate_id = 56, 
                                    id = 56, 
                                    name = '', 
                                    permissions = [
                                        ''
                                        ], )
                                ], 
                            vendor = openapi_client.models.user_vendor.User_vendor(
                                can_work_manual_files = True, 
                                email_open_rate = 1.337, 
                                is_frozen = True, 
                                is_proofreader = True, 
                                native_language = '', 
                                pam_tqs = 1.337, 
                                paypal_email = '', 
                                profile_survey = openapi_client.models.profile_survey.ProfileSurvey(
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
                                    xtm = '', ), 
                                require_1099 = True, 
                                tags = [
                                    ''
                                    ], 
                                tms_user_name = '', 
                                vendor_type = '', ), 
                            zip_code = '', ), 
                        word_count = 56, )
                    ]
            )
        else:
            return UsersReport(
        )
        """

    def testUsersReport(self):
        """Test UsersReport"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
