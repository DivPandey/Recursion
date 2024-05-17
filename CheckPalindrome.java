public class CheckPalindrome {
    public static boolean check(String A){
        if(A.length()==2){
            if(A.charAt(0)==A.charAt(1)) return true;
            else{
                return false;
            }
        }
        if(A.length()==1) return true;
        char i = A.charAt(0);
        char j = A.charAt(A.length()-1);
        if(i!=j) return false;
        return check(A.substring(1, A.length()-1));
    }
    public static void main(String[] args) {
        String s="mnschgziwincvcrhegtkkgzuewasvstiogqaijvtvikjjivatyqbnsrnfcrhxlkkrrqrmzemiqbujbktdnejobxtcjiibcfynrfxbbqwujyleetwwalbuewgewkdrefcdptqgpqhqvguniapbdzdxexeealxmtbmlsdihyllmnmltghyetghrtmpimqepumuzvkdmxvyoweexxckmyqtirjnebodjmuzozmvypdcalffowunzrlflvmimxhemvlhobeenpcvynchlxpsdvlmeddahnvkspuqhgrxdukrhtbtlpxyblucxuyoowsxgtqeiotylvonaublmozlvwsphfilxfncegpleebaiufdjmpiolgdbfcshbwjchuxumyxhhrujifbcehsniqpghdztvztxvliztiqzwaktqohpntxeyfeaijldzhnsyvhjixlymtmrfvzlqgdomawrfddcagjagvcfhbyqgixyqbbpyjijeviyhwrignduetolptfyvmklmdrxqvrdnwssvgujqfwukneddqdvvqxxmuhtxuiufbqxswstgrykpoeiizmbpoturgrnvsshhzoppyktljqxxuhcdfsmesaimxicxfslnfagdfaoczbhivhxmotzbpulduuczfyeijkkcwmqqtrqstwiqmkatyjotoexkeesprwzfxwzshwlqfssryxxvybnrxdiuusvnnlfabkpynsakpnftjqhecuwmyqgwhyrtudmkfcphnnyxqxzxbucfewihqmjjnblrmyertspotzfgzvabnhcxklqdlbtvvqwynenkkhxcjsndltankzkmrkknbkxjqzabatkcdvodhzzmqqcfwshhufezzddzrfldwxylaylpfqpiczfmyymfzcipqfplyalyxwdlfrzddzzefuhhswfcqqmzzhdovdcktabazqjxkbnkkrmkzknatldnsjcxhkknenywqvvtbldqlkxchnbavzgfztopstreymrlbnjjmqhiwefcubxzxqxynnhpcfkmdutryhwgqymwucehqjtfnpkasnypkbaflnnvsuuidxrnbyvxxyrssfqlwhszwxfzwrpseekxeotojytakmqiwtsqrtqqmwckkjieyfzcuudlupbztomxhvihbzcoafdgafnlsfxcixmiasemsfdchuxxqjltkyppozhhssvnrgrutopbmziieopkyrgtswsxqbfuiuxthumxxqvvdqddenkuwfqjugvsswndrvqxrdmlkmvyftploteudngirwhyivejijypbbqyxigqybhfcvgajgacddfrwamodgqlzvfrmtmylxijhvysnhzdljiaefyextnphoqtkawzqitzilvxtzvtzdhgpqinshecbfijurhhxymuxuhcjwbhscfbdgloipmjdfuiabeelpgecnfxlifhpswvlzomlbuanovlytoieqtgxswooyuxculbyxpltbthrkudxrghqupskvnhaddemlvdspxlhcnyvcpneebohlvmehxmimvlflrznuwofflacdpyvmzozumjdobenjritqymkcxxeewoyvxmdkvzumupeqmipmtrhgteyhgtlmnmllyhidslmbtmxlaeexexdzdbpainugvqhqpgqtpdcferdkwegweublawwteelyjuwqbbxfrnyfcbiijctxbojendtkbjubqimezmrqrrkklxhrcfnrsnbqytavijjkivtvjiaqgoitsvsaweuzgkktgehrcvcniwizghcsnm";
        System.out.println(check(s));
    }
}
