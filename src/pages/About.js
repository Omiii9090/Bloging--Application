import userContext from "../context/userContext";
import Base from "../components/Base";

const About = () => {
  return (
    <userContext.Consumer>
      {(object) => (
        <Base>
         {console.log(object)}
          <h1>Welcome user: {object.user.login && object.user.data.name}</h1>
          <h1>Thrilling topics to look out for</h1>
          <p>Blogs are informal articles written for the purpose of showing thought leadership and expertise on a topic. They are a great way to generate fresh content on a website and provide a catalyst for email marketing, social media promotion to drive search traffic to your website.

          <h3><li> Helps Get Your Website Found </li></h3> 
          The ultimate goal in creating blogs is to drive as much traffic to your website as possible. When you create a blog post this creates one more indexed page on your website, meaning it’s one more opportunity for you to show up in search engines and drive traffic to your website. Creating content regularly informs search engines, such as Google, that your website is actively updated and therefore should be checked frequently to see what new content has surfaced.
          <h3><li> Use That Traffic to Convert Visitors to Leads
 </li></h3> 
 When you attract new visitors to your website this creates a new opportunity to generate leads. This is where your Call-To-Action (CTA) buttons come in handy. A CTA is a way of directing your website visitors through your website, to keep them engaged on your site, guide them through their journey from awareness to purchase. Good CTA’s include “Find out more”, “download”, discounts, free offers, options to subscribe to your mailing list, etc. You can also use the CTA button on a blog post to move the visitor along to another relevant blog topic on your website or even convert them to a relevant page on your website that explains your services.



          </p>
         
        </Base>
      )}
    </userContext.Consumer>
  );
};

export default About;
