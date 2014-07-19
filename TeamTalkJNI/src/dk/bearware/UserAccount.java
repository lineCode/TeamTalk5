/*
 * Copyright (c) 2005-2014, BearWare.dk
 * 
 * Contact Information:
 *
 * Bjoern D. Rasmussen
 * Skanderborgvej 40 4-2
 * DK-8000 Aarhus C
 * Denmark
 * Email: contact@bearware.dk
 * Phone: +45 20 20 54 59
 * Web: http://www.bearware.dk
 *
 * This source code is part of the TeamTalk 5 SDK owned by
 * BearWare.dk. All copyright statements may not be removed 
 * or altered from any source distribution. If you use this
 * software in a product, an acknowledgment in the product 
 * documentation is required.
 *
 */

package dk.bearware;

public class UserAccount
{
    public String szUsername = "";
    public String szPassword = "";
    public int uUserType = UserType.USERTYPE_NONE;
    public int uUserRights = UserRight.USERRIGHT_NONE;
    public int nUserData = 0;
    public String szNote = "";
    public String szInitChannel = "";
    public int[] autoOperatorChannels = new int[Constants.TT_CHANNELS_OPERATOR_MAX];
    public int nAudioCodecBpsLimit;
}
